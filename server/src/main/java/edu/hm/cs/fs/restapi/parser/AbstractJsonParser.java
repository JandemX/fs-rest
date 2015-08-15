package edu.hm.cs.fs.restapi.parser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.common.io.CharStreams;

/**
 * An abstract parser for json content.
 *
 * @author Fabio
 */
public abstract class AbstractJsonParser<T> extends AbstractContentParser<T> {
	/**
	 * Creates an abstract parser for json content.
	 *
	 * @param url to parse.
	 */
	public AbstractJsonParser(final String url) {
		super(url);
	}

	@Override
	public List<T> read(final String url) {
		final List<T> result = new ArrayList<>();
		try {
			final URL source = new URL(url);
			final HttpURLConnection conn = (HttpURLConnection) source.openConnection();
			conn.setReadTimeout(3000);
			conn.setConnectTimeout(5000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.connect();

			final String content = CharStreams.readLines(new InputStreamReader(conn.getInputStream())).stream().collect(Collectors.joining("\n")).trim();

			if (content.charAt(0) == '[') {
				result.addAll(convert(new JSONArray(content)));
			}
			else {
				result.addAll(convert(new JSONObject(content)));
			}
		} catch (final Exception e) {
			e.printStackTrace();
			// TODO Log.e(getClass().getSimpleName(), "", e);
		}
		return result;
	}

	/**
	 * Convert an json array to a list with objects.
	 *
	 * @param data to convert.
	 *
	 * @return a list with objects.
	 */
	public List<T> convert(final JSONArray data) {
		return new ArrayList<>();
	}

	/**
	 * Convert an json object to a list with objects.
	 *
	 * @param data to convert.
	 *
	 * @return a list with objects.
	 */
	public List<T> convert(final JSONObject data) {
		return new ArrayList<>();
	}
}