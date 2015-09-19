package edu.hm.cs.fs.restapi.controller.v1;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.xpath.XPathExpressionException;

import edu.hm.cs.fs.restapi.parser.PersonParser;
import edu.hm.cs.fs.restapi.parser.cache.CachedPersonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.hm.cs.fs.common.model.BlackboardEntry;
import edu.hm.cs.fs.restapi.parser.BlackboardParser;

/**
 * The BlackboardController represents the interface to the REST-API. It has different methods to
 * access blackboard entries and filter them.
 * <p> Url: <a href="http://fi.cs.hm.edu/fi/rest/public/news">http://fi.cs.hm.edu/fi/rest/public/news</a>
 *
 * @author Fabio
 */
@RestController
public class BlackboardController {
    /**
     * Requests all blackboard entries from
     * <a href="http://fi.cs.hm.edu/fi/rest/public/news">http://fi.cs.hm.edu/fi/rest/public/news</a>.
     *
     * @param search for the words in the entry title and description.
     * @return a list with all matched entries.
     * @throws Exception
     */
    @RequestMapping("/rest/api/1/blackboard")
    public List<BlackboardEntry> getBlackboard(@RequestParam(value = "search", defaultValue = "") String search)
            throws Exception {
        return new BlackboardParser(new PersonParser()).getAll().stream()
                .filter(entry -> entry.getSubject().contains(search) || entry.getText().contains(search))
                .collect(Collectors.toList());
    }
}