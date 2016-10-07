package org.onedrive.container;

import java.lang.reflect.Field;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

/**
 * {@// TODO: Enhance javadoc}
 *
 * @author <a href="mailto:yoobyeonghun@gmail.com" target="_top">isac322</a>
 */
abstract public class BaseContainer {
	public static ZonedDateTime parseDateTime(String timestamp) {
		if (timestamp == null) return null;
		return ZonedDateTime.ofInstant(Instant.parse(timestamp), ZoneId.systemDefault());
	}
}
