/**
 * Copyright © 2018 Reijhanniel Jearl Campos (devcsrj@apache.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package devcsrj.maven

data class Page<out T>(
    /**
     * The current page number.
     */
    val number: Int,
    /**
     * The maximum items to fetch per page.
     */
    val limit: Int,
    /**
     * The actual result collection.
     */
    val items: List<T>,
    /**
     * The total number of pages.
     */
    val totalPages: Int,
    /**
     * The total number of items.
     */
    val totalItems: Long) {

    companion object {

        @JvmStatic
        fun <T> empty(): Page<T> {
            return Page(1, 10, emptyList(), 0, 0)
        }
    }
}