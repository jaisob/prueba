package com.isb.console;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Event {

	private String id;
	private String origin;
	private String destinationAgent;
	private String translation;
	private transient Map<String, Object> attachedData = null;
	private transient Map<String, Object> infoData = null;

	public String getHandlerType() {
		Object handlerType = getInfoData(Constants.HANDLER_TYPE);
		return handlerType == null ? null : handlerType.toString();
	}

	public String getStatus() {
		Object status = getInfoData(Constants.STATUS);
		return status == null ? null : status.toString();
	}

	public String getReason() {
		Object reason = getInfoData(Constants.REASON);
		return reason == null ? null : reason.toString();
	}

	public String getType() {
		Object type = getInfoData(Constants.TYPE);
		return type == null ? null : type.toString();
	}

	public String getMediaType() {
		Object media = getInfoData(Constants.MEDIA);
		return media == null ? null : media.toString();
	}

	public void addAttachedData(String key, Object data) {
		if (attachedData == null) {
			attachedData = new HashMap<>();
		}
		attachedData.put(key, data);
	}

	public void addInfoData(String key, Object data) {
		if (infoData == null) {
			infoData = new HashMap<>();
		}
		infoData.put(key, data);
	}

	public Object getAttachedData(String key) {
		if (attachedData != null && attachedData.containsKey(key)) {
			return attachedData.get(key);
		} else {
			return null;
		}

	}

	public Object getInfoData(String key) {
		if (infoData != null && infoData.containsKey(key)) {
			return infoData.get(key);
		} else {
			return null;
		}
	}
}
