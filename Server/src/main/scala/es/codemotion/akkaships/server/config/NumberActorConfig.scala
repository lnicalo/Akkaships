/**
 * Copyright (C) 2015 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.codemotion.akkaships.server.config

import com.typesafe.config.Config


object NumberActorConfig {
   val ServerExecutorInstances = 5
   val ServerActorInstancesProp = "config.akka.number.server-actor"
}

trait NumberActorConfig {

  import NumberActorConfig._
  lazy val serverActorInstances: Int = Option(config.getString(ServerActorInstancesProp)).map(_.toInt).getOrElse(ServerExecutorInstances)
  def config: Config

}