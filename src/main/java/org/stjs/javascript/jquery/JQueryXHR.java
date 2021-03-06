package org.stjs.javascript.jquery;

import org.stjs.javascript.Array;
import org.stjs.javascript.XMLHttpRequest;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.CallbackOrFunction;

@SyntheticType
public abstract class JQueryXHR extends XMLHttpRequest {
	public String responseText;
	public String responseXML;

	@Override
	public native String getResponseHeader(String header);

	public native void overrideMimeType(String type);

	// copy the methods from Promise as in Java we cannot have multiple inheritence
	public native Promise always(CallbackOrFunction... callbacks);

	public native Promise always(Array<? extends CallbackOrFunction>... callbacks);

	public native Promise done(CallbackOrFunction... callbacks);

	public native Promise done(Array<? extends CallbackOrFunction>... callbacks);

	public native Promise fail(CallbackOrFunction... callbacks);

	public native Promise fail(Array<? extends CallbackOrFunction>... callbacks);

	public native String state();

	public native Promise then(CallbackOrFunction doneCallback);

	public native Promise then(CallbackOrFunction doneCallback, CallbackOrFunction failFilter);

	public native Promise then(CallbackOrFunction doneCallback, CallbackOrFunction failFilter,
			CallbackOrFunction progressFilter);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback, CallbackOrFunction failFilter);

	public native Promise then(Array<? extends CallbackOrFunction> doneCallback, CallbackOrFunction failFilter,
			CallbackOrFunction progressFilter);
}
