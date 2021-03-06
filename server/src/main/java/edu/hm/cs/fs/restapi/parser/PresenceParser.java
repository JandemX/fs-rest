package edu.hm.cs.fs.restapi.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import edu.hm.cs.fs.common.model.Presence;

/**
 * @author Fabio
 */
public class PresenceParser extends AbstractJsonParser<Presence> {
    private final static String URL = "http://fs.cs.hm.edu/presence/?app=true";

    public PresenceParser() {
        super(URL);
    }

    @Override
    public List<Presence> convert(JSONObject data) {
        List<Presence> result = new ArrayList<>();
        try {
            JSONArray jsonArray = data.getJSONArray("persons");
            result = IntStream.range(0, jsonArray.length())
                    .parallel()
                    .mapToObj(jsonArray::getJSONObject)
                    .map(jsonObject -> {
                        Presence presence = new Presence();
                        presence.setName(jsonObject.getString("nickName"));
                        presence.setStatus(jsonObject.getString("status"));
                        return presence;
                    })
                    .collect(Collectors.toList());
        } catch (JSONException e) {
            Logger.getGlobal().log(Level.SEVERE, "", e);
        }
        return result;
    }
}
