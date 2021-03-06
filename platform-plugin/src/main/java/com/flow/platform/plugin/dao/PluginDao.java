/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.plugin.dao;

import com.flow.platform.plugin.domain.Plugin;
import com.flow.platform.plugin.domain.PluginStatus;
import java.util.List;

/**
 * @author yh@firim
 */
public interface PluginDao {

    /**
     * list all plugins
     * @return
     */
    List<Plugin> list(PluginStatus... status);

    /**
     * find plugin
     * @param name
     * @return
     */
    Plugin get(String name);

    /**
     * update plugin
     * @param plugin
     * @return
     */
    Plugin update(Plugin plugin);

    /**
     * dump cache to file
     */
    void dumpCacheToFile();

    /**
     * refresh cache
     */
    void refreshCache();
}
