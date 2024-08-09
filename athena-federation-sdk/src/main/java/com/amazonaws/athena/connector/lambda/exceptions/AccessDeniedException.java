package com.amazonaws.athena.connector.lambda.exceptions;

/*-
 * #%L
 * Amazon Athena Query Federation SDK
 * %%
 * Copyright (C) 2019 Amazon Web Services
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Throw this exception if connector does not have the necessary permissions or rights
 * to perform a specific action. It can be used if the supplied crendentials is expired,
 * or the specified resource/host does not exist
 */
public class AccessDeniedException
        extends RuntimeException
{
    public AccessDeniedException()
    {
        super();
    }

    public AccessDeniedException(String message)
    {
        super(message);
    }

    public AccessDeniedException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
