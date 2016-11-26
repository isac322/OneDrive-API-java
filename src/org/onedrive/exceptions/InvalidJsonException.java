package org.onedrive.exceptions;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * {@// TODO: Enhance javadoc }
 * Exception type for when SDK encounters invalid JSON from server. That means client's request was valid but
 * OneDrive's server responses with invalid JSON. So if you encounter with this exception, firstly retry. but if it
 * happens continuously contact <a href="mailto:yoobyeonghun@gmail.com" target="_top">author</a> with {@code content}.
 *
 * @author <a href="mailto:yoobyeonghun@gmail.com" target="_top">isac322</a>
 */
public class InvalidJsonException extends RuntimeException implements OneDriveServerException {
	@Getter private byte[] content;
	@Getter private int responseCode;

	public InvalidJsonException(@Nullable Throwable cause, int responseCode, @Nullable byte[] content) {
		super("Invalid JSON response from server with " + responseCode + " response code.", cause);
		this.responseCode = responseCode;
		this.content = content;
	}

	public InvalidJsonException(@Nullable String message, int responseCode, @Nullable byte[] content) {
		super(message);
		this.responseCode = responseCode;
		this.content = content;
	}

	public InvalidJsonException(@NotNull String message) {
		super(message);
	}
}