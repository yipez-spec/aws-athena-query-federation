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
 * Throw this exception if a function or method has been provided with input that is not valid or
 * does not meet the expected criteria. This includes but are not limited to: malformed connector
 * configuration, invalid query operations.
 */
public class InvalidInputException
        extends RuntimeException
{
    public InvalidInputException()
    {
        super();
    }

    public InvalidInputException(String message)
    {
        super(message);
    }

    public InvalidInputException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
