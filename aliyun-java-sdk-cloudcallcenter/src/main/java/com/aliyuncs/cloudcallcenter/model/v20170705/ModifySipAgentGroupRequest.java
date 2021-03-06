/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySipAgentGroupRequest extends RpcAcsRequest<ModifySipAgentGroupResponse> {
	
	public ModifySipAgentGroupRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifySipAgentGroup", "CloudCallCenter", "innerAPI");
	}

	private String provider;

	private String port;

	private String ip;

	private String name;

	private Long id;

	private Integer sendInterface;

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("Provider", provider);
		}
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Integer getSendInterface() {
		return this.sendInterface;
	}

	public void setSendInterface(Integer sendInterface) {
		this.sendInterface = sendInterface;
		if(sendInterface != null){
			putQueryParameter("SendInterface", sendInterface.toString());
		}
	}

	@Override
	public Class<ModifySipAgentGroupResponse> getResponseClass() {
		return ModifySipAgentGroupResponse.class;
	}

}
