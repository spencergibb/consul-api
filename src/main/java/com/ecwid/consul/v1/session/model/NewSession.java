package com.ecwid.consul.v1.session.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Vasily Vasilkov (vgv@ecwid.com)
 */
public class NewSession {

	@SerializedName("LockDelay")
	private long lockDelay;

	@SerializedName("Name")
	private String name;

	@SerializedName("Node")
	private String node;

	@SerializedName("Checks")
	private List<String> checks;

	public long getLockDelay() {
		return lockDelay;
	}

	public void setLockDelay(long lockDelayInSeconds) {
		this.lockDelay = lockDelayInSeconds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public List<String> getChecks() {
		return checks;
	}

	public void setChecks(List<String> checks) {
		this.checks = checks;
	}
}
