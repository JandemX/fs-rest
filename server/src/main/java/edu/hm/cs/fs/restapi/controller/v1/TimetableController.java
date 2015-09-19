package edu.hm.cs.fs.restapi.controller.v1;

import com.google.common.base.Strings;
import edu.hm.cs.fs.common.model.Group;
import edu.hm.cs.fs.common.model.Lesson;
import edu.hm.cs.fs.common.model.LessonGroup;
import edu.hm.cs.fs.restapi.parser.LessonParser;
import edu.hm.cs.fs.restapi.parser.ModuleParser;
import edu.hm.cs.fs.restapi.parser.PersonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Fabio
 */
@RestController
public class TimetableController {
    /**
     *
     * @param group
     * @return
     * @throws Exception
     */
    @RequestMapping("/rest/api/1/timetable/modules")
    public List<LessonGroup> getLessonsGroups(@RequestParam("group") Group group) throws Exception {
        Map<String, LessonGroup> result = new HashMap<>();
        new LessonParser(new PersonParser(), new ModuleParser(new PersonParser()), group).getAll().stream()
                .forEach(lesson -> {
                    LessonGroup lessonGroup = new LessonGroup();
                    lessonGroup.setGroup(group);
                    lessonGroup.setTeacher(lesson.getTeacher());
                    lessonGroup.setModule(lesson.getModule());
                    lessonGroup.setGroups(new ArrayList<>());
                    final String key = lessonGroup.getModule().getId() + lessonGroup.getTeacher().getId();
                    if (!result.containsKey(key)) {
                        result.put(key, lessonGroup);
                    }
                    final List<Integer> groups = result.get(key).getGroups();
                    final Matcher matcher = Pattern.compile("([0-9]+)\\.").matcher(lesson.getSuffix());
                    while (matcher.find()) {
                        final int pk = Integer.parseInt(matcher.group(1));
                        if(!groups.contains(pk)) {
                            groups.add(pk);
                        }
                        Collections.sort(groups);
                    }
                });
        return new ArrayList<>(result.values());
    }

    /**
     *
     * @param group
     * @param moduleId
     * @param teacherId
     * @param pk
     * @return
     * @throws Exception
     */
    @RequestMapping("/rest/api/1/timetable/lessons")
    public List<Lesson> getLessons(@RequestParam("group") Group group,
                                   @RequestParam("module") String moduleId,
                                   @RequestParam("teacher") String teacherId,
                                   @RequestParam(value = "pk", defaultValue = "-1") int pk) throws Exception {
        return new LessonParser(new PersonParser(), new ModuleParser(new PersonParser()), group).getAll()
                .parallelStream()
                .filter(lesson -> moduleId.equals(lesson.getModule().getId()))
                .filter(lesson -> teacherId.equals(lesson.getTeacher().getId()))
                .filter(lesson -> {
                    if(pk == -1 || Strings.isNullOrEmpty(lesson.getSuffix())) {
                        return true;
                    }
                    final Matcher matcher = Pattern.compile("([0-9]+)\\.").matcher(lesson.getSuffix());
                    while (matcher.find()) {
                        if(Integer.parseInt(matcher.group(1)) == pk) {
                            return true;
                        }
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}