/*
 * @(#)$Id: StatusServer.java 38 2008-10-24 19:23:35Z unsaved $
 *
 * Copyright 2008 by the JWebMail Development Team and Sebastian Schaffert.
 *
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


package net.wastl.webmail.server;

/**
 * StatusServer.java
 *
 * A Server object that can return a status message.
 *
 * Created: Sun Dec 31 16:07:04 2000
 *
 * @author Sebastian Schaffert
 */
public interface StatusServer  {
    /**
     * Return a status message.
     */
    public String getStatus();
}
