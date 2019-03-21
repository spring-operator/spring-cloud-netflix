/*
 * Copyright 2013-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.zuul.filters.route;

import org.springframework.http.client.ClientHttpResponse;

/**
 * Provides fallback when a failure occurs on a route.
 *
 * @author Ryan Baxter
 * @author Dominik Mostek
 */
public interface FallbackProvider {

	/**
	 * The route this fallback will be used for.
	 * @return The route the fallback will be used for.
	 */
	String getRoute();

	/**
	 * Provides a fallback response based on the cause of the failed execution.
	 * @param route The route the fallback is for
	 * @param cause cause of the main method failure, may be <code>null</code>
	 * @return the fallback response
	 */
	ClientHttpResponse fallbackResponse(String route, Throwable cause);

}
