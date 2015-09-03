package edu.hm.cs.fs.restapi.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import edu.hm.cs.fs.common.model.Presence;
import edu.hm.cs.fs.restapi.parser.PresenceParser;

/**
 * @author Fabio
 */
@RestController
public class FsController {
    /**
     *
     * @return
     * @throws IOException 
     * @throws MalformedURLException 
     */
    @RequestMapping("/rest/api/1/fs/presence")
    public List<Presence> getPresence() throws MalformedURLException, IOException {
        return new PresenceParser().parse();
    }
}
