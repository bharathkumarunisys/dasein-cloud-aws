/**
 * Copyright (C) 2009-2013 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.aws.storage;

public class S3Exception extends Exception {
	private static final long serialVersionUID = -1187862739180492610L;
	
	private String code      = null;
	private String requestId = null;
	private int    status    = 0;
	
	public S3Exception(int status, String requestId, String code, String message) {
		super(message);
		this.requestId = requestId;
		this.code = code;
		this.status = status;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getRequestId() {
		return requestId;
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getSummary() { 
		return (status + "/" + requestId + "/" + code + ": " + getMessage());
	}
}
