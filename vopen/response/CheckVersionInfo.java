package vopen.response;

import org.json.JSONObject;

import common.util.BaseUtil;

public class CheckVersionInfo {
	/**
	 * {"version":"2.0.1",
	 * "apkurl":"http://file.ws.126.net/m/110809/vopen_update_v2.0.1_build22.apk",
	 * "title":"版本升级公告",
	 * "content":"网易公开课V2.0.1版发布，支持「视频下载，离线观看」，记得升级喔 ^_^"}
	 */

	public String version;
	public String apkurl;
	public String title;
	public String content;
	//允许的最低版本号，如果低于这个值，那么将强制升级
	public String minVersion;
	//在这个版本以下的版本会弹出升级
	public String alertVersion;

	public CheckVersionInfo(JSONObject jso) {
		parseJson(jso);
	}

	public void parseJson(JSONObject jso) {
		version = BaseUtil.nullStr(jso.optString("version"));
		apkurl = BaseUtil.nullStr(jso.optString("apkurl"));
		title = BaseUtil.nullStr(jso.optString("title"));
		content = BaseUtil.nullStr(jso.optString("content"));
		minVersion = BaseUtil.nullStr(jso.optString("min"));
		alertVersion = BaseUtil.nullStr(jso.optString("alert"));
	}
}
