package edu.hm.cs.fs.restclient;

import edu.hm.cs.fs.common.constant.*;
import edu.hm.cs.fs.common.model.*;
import edu.hm.cs.fs.common.model.simple.SimpleJob;
import edu.hm.cs.fs.common.model.simple.SimpleModule;
import edu.hm.cs.fs.common.model.simple.SimplePerson;
import edu.hm.cs.fs.common.model.simple.SimpleRoom;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

import java.util.List;

/**
 * The Rest Client of Version 1.
 *
 * @author Fabio
 */
public interface RestClientV1 {
    String ROOT_PATH = "/rest/api/1/";

    ////////////////////////////////////////////////////////////////////
    //
    // Blackboard
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all blackboard entries.
     *
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntries();

    /**
     * Requests all blackboard entries asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntries(Callback<List<BlackboardEntry>> callback);

    /**
     * Requests all blackboard entries that fit the search.
     *
     * @param search string to search for.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntries(@Query("search") String search);
    
    /**
     * Requests all blackboard entries that fit the search.
     *
     * @param search string to search for.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntries(@Query("search") String search, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param group representing an study group.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntries(@Query("group") Group group);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param group representing an study group.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntries(@Query("group") Group group, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param since a long representing an date.
     * @param before a long representing an date.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntries(@Query("search") String search, @Query("group") Group group, @Query("since") long since, @Query("before") long before);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param since a long representing an date.
     * @param before a long representing an date.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntries(@Query("search") String search, @Query("group") Group group, @Query("since") long since, @Query("before") long before, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries that are publish after 'since'.
     *
     * @param since a long representing an date.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntriesSince(@Query("since") long since);
    
    /**
     * Requests all blackboard entries that are publish after 'since' asynchronous.
     *
     * @param since a long representing an date.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntriesSince(@Query("since") long since, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param since a long representing an date.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntriesSince(@Query("search") String search, @Query("group") Group group, @Query("since") long since);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param since a long representing an date.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntriesSince(@Query("search") String search, @Query("group") Group group, @Query("since") long since, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries that are publish before 'before'.
     *
     * @param before a long representing an date.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntriesBefore(@Query("before") long before);

    /**
     * Requests all blackboard entries that are publish before 'before'.
     *
     * @param before a long representing an date.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntriesBefore(@Query("before") long before, Callback<List<BlackboardEntry>> callback);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param before a long representing an date.
     * @return a list with blackboard entries.
     */
    @GET(ROOT_PATH + "blackboard")
    Observable<List<BlackboardEntry>> getEntriesBefore(@Query("search") String search, @Query("group") Group group, @Query("before") long before);
    
    /**
     * Requests all blackboard entries for an study group.
     *
     * @param search to search for in blackboard entry.
     * @param group representing an study group.
     * @param before a long representing an date.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "blackboard")
    void getEntriesBefore(@Query("search") String search, @Query("group") Group group, @Query("before") long before, Callback<List<BlackboardEntry>> callback);
    
    
    ////////////////////////////////////////////////////////////////////
    //
    // Calendar
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all termins.
     *
     * @return a list with termins.
     */
    @GET(ROOT_PATH + "calendar/termin")
    Observable<List<Event>> getTermins();

    /**
     * Requests all termins asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "calendar/termin")
    void getTermins(Callback<List<Event>> callback);

    /**
     * Requests all holidays.
     *
     * @return a list with holidays.
     */
    @GET(ROOT_PATH + "calendar/holiday")
    Observable<List<Holiday>> getHolidays();

    /**
     * Requests all holidays asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "calendar/holiday")
    void getHolidays(Callback<List<Holiday>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Student Council
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all presence.
     *
     * @return a list with presence.
     */
    @GET(ROOT_PATH + "fs/presence")
    Observable<List<Presence>> getPresence();

    /**
     * Requests all presence asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "fs/presence")
    void getPresence(Callback<List<Presence>> callback);

    /**
     * Request all News from the FS Website.
     *
     * @return a list with all News.
     */
    @GET(ROOT_PATH + "fs/news")
    Observable<List<News>> getNews();

    /**
     * Request all News from the FS Website.
     *
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "fs/news")
    void getNews(final Callback<List<News>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Job
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all jobs.
     *
     * @return a list with jobs.
     */
    @GET(ROOT_PATH + "jobs")
    Observable<List<SimpleJob>> getJobs();

    /**
     * Requests all jobs asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "jobs")
    void getJobs(final Callback<List<SimpleJob>> callback);

    /**
     * Requests all searched jobs.
     *
     * @param searchContent the job title and description for matching.
     * @return a list with jobs.
     */
    @GET(ROOT_PATH + "jobs")
    Observable<List<SimpleJob>> getJobs(@Query("search") final String searchContent);

    /**
     * Requests all searched jobs asynchronous.
     *
     * @param search   the job title and description for matching.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "jobs")
    void getJobs(@Query("search") final String search,
                          final Callback<List<SimpleJob>> callback);
    
    /**
     * Requests an job by id.
     *
     * @param id the job id.
     * @return a job.
     */
    @GET(ROOT_PATH + "job")
    Observable<SimpleJob> getJobById(@Query("id") final String id);

    /**
     * Requests an job by id.
     *
     * @param id the job id.
     * @return a job.
     */
    @GET(ROOT_PATH + "job")
    void getJobById(@Query("id") final String id,
                          final Callback<List<SimpleJob>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Rooms
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all free rooms.
     *
     * @param day    to search at.
     * @param hour   to search at.
     * @param minute to search at.
     * @return a list with free rooms.
     */
    @GET(ROOT_PATH + "room")
    Observable<List<SimpleRoom>> getRoomByDateTime(@Query("type") RoomType type, @Query("day") Day day, @Query("hour") int hour,
                                       @Query("minute") int minute);

    /**
     * Requests all free rooms asynchronous.
     *
     * @param day      to search at.
     * @param hour     to search at.
     * @param minute   to search at.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "room")
    void getRoomByDateTime(@Query("type") RoomType type, @Query("day") Day day, @Query("hour") int hour,
                           @Query("minute") int minute, Callback<List<SimpleRoom>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Timetable
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all lessons from a specified group.
     *
     * @param group to get the lessons from.
     * @return a list with lessons.
     */
    @GET(ROOT_PATH + "timetable/modules")
    Observable<List<LessonGroup>> getLessonGroups(@Query("group") Group group);

    /**
     * Requests all lessons from a specified group asynchronous.
     *
     * @param group    to get the lessons from.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "timetable/modules")
    void getLessonGroups(@Query("group") Group group, Callback<List<LessonGroup>> callback);

    /**
     * Requests all lessons by the specified parameters.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @return a list with lessons.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    Observable<List<Lesson>> getLessons(@Query("group") Group group, @Query("module") String moduleId);
    
    /**
     * Requests all lessons by the specified parameters asynchronous.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @param callback  to retrieve the result.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    void getLessons(@Query("group") Group group, @Query("module") String moduleId, Callback<List<Lesson>> callback);
    
    /**
     * Requests all lessons by the specified parameters.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @param teacherId of the prof.
     * @return a list with lessons.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    Observable<List<Lesson>> getLessons(@Query("group") Group group, @Query("module") String moduleId,
                            @Query("teacher") String teacherId);

    /**
     * Requests all lessons by the specified parameters asynchronous.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @param teacherId of the prof.
     * @param callback  to retrieve the result.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    void getLessons(@Query("group") Group group, @Query("module") String moduleId,
                    @Query("teacher") String teacherId, Callback<List<Lesson>> callback);

    /**
     * Requests all lessons by the specified parameters.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @param teacherId of the prof.
     * @param pk if it is a practical lecture.
     * @return a list with lessons.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    Observable<List<Lesson>> getLessons(@Query("group") Group group, @Query("module") String moduleId,
                            @Query("teacher") String teacherId, @Query("pk") int pk);

    /**
     * Requests all lessons by the specified parameters asynchronous.
     *
     * @param group to get the correct lessons.
     * @param moduleId of the module.
     * @param teacherId of the prof.
     * @param pk if it is a practical lecture.
     * @param callback  to retrieve the result.
     */
    @GET(ROOT_PATH + "timetable/lessons")
    void getLessons(@Query("group") Group group, @Query("module") String moduleId,
                    @Query("teacher") String teacherId, @Query("pk") int pk,
                    Callback<List<Lesson>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Module
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all modules in a small form for lower traffic usage.
     *
     * @return a list with modules.
     */
    @GET(ROOT_PATH + "modules")
    Observable<List<SimpleModule>> getModules();

    /**
     * Requests all modules in a small form for lower traffic usage asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "modules")
    void getModules(Callback<List<SimpleModule>> callback);

    /**
     * Requests a module by id with all information.
     *
     * @param moduleId to request.
     * @return the module.
     */
    @GET(ROOT_PATH + "module")
    Observable<Module> getModuleById(@Query("id") String moduleId);

    /**
     * Requests a module by id with all information asynchronous.
     *
     * @param moduleId to request.
     * @param callback to retrive the result.
     */
    @GET(ROOT_PATH + "module")
    void getModuleById(@Query("id") String moduleId, Callback<Module> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Exam
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all exams.
     *
     * @return a list with exams.
     */
    @GET(ROOT_PATH + "exam")
    Observable<List<Exam>> getExams();

    /**
     * Requests all exams asynchronous.
     *
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "exam")
    void getExams(Callback<List<Exam>> callback);

    /**
     * Requests all lessons of the specified study group and module.
     *
     * @param studyGroup to search for.
     * @param moduleId   to search for.
     * @return a list with exams.
     */
    @GET(ROOT_PATH + "exam")
    Observable<List<Exam>> getExams(@Query("group") String studyGroup, @Query("module") String moduleId);

    /**
     * Requests all lessons of the specified study group and module asynchronous.
     *
     * @param studyGroup to search for.
     * @param moduleId   to search for.
     * @param callback   to retrieve the result.
     */
    @GET(ROOT_PATH + "exam")
    void getExams(@Query("group") String studyGroup, @Query("module") String moduleId,
                  Callback<List<Exam>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Person
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Request all the persons.
     *
     * @return a list with persons.
     */
    @GET(ROOT_PATH + "persons")
    Observable<List<SimplePerson>> getPersons();

    /**
     * Request all the persons asynchronous.
     *
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "persons")
    void getPersons(final Callback<List<SimplePerson>> callback);

    /**
     * Request the person by id.
     *
     * @param personId to get the person from.
     * @return a person.
     */
    @GET(ROOT_PATH + "person")
    Observable<Person> getPersonById(@Query("id") final String personId);

    /**
     * Request the person by id asynchronous.
     *
     * @param personId to get the person from.
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "person")
    void getPersonById(@Query("id") final String personId,
                       final Callback<Person> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Lost & Found
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Request the lost and founds.
     *
     * @return a person.
     */
    @GET(ROOT_PATH + "lostandfound")
    Observable<List<LostFound>> getLostAndFound();

    /**
     * Request the lost and founds asynchronous.
     *
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "lostandfound")
    void getLostAndFound(final Callback<List<LostFound>> callback);

    /**
     * Request the lost and founds.
     *
     * @param content to search for.
     * @return a person.
     */
    @GET(ROOT_PATH + "lostandfound")
    Observable<List<LostFound>> getLostAndFound(@Query("search") final String content);

    /**
     * Request the lost and founds asynchronous.
     *
     * @param content  to search for.
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "lostandfound")
    void getLostAndFound(@Query("serach") final String content,
                         final Callback<List<LostFound>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Mensa
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Requests all meals.
     *
     * @param location of the mensa or stucafe.
     * @return a list with meals.
     */
    @GET(ROOT_PATH + "meal")
    Observable<List<Meal>> getMeals(@Query("location") StudentWorkMunich location);

    /**
     * Requests all meals asynchronous.
     *
     * @param location of the mensa or stucafe.
     * @param callback to retrieve the result.
     */
    @GET(ROOT_PATH + "meal")
    void getMeals(@Query("location") StudentWorkMunich location, Callback<List<Meal>> callback);

    ////////////////////////////////////////////////////////////////////
    //
    // Public Transport
    //
    ///////////////////////////////////////////////////////////////////

    /**
     * Request all departures from a specified location of the mvv.
     *
     * @param location to get the departures from.
     * @return a list with public transport possibilities.
     */
    @GET(ROOT_PATH + "publicTransport")
    Observable<List<PublicTransport>> getPublicTransports(
            @Query("location") final PublicTransportLocation location);

    /**
     * Request all departures from a specified location of the mvv asynchronous.
     *
     * @param location to get the departures from.
     * @param callback to retrieve the results.
     */
    @GET(ROOT_PATH + "publicTransport")
    void getPublicTransports(@Query("location") final PublicTransportLocation location,
                             final Callback<List<PublicTransport>> callback);

}
