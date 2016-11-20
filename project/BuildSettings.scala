/*
 * Copyright 2012-2015 2ndlanguage Limited.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
import sbt.Keys._
import sbt._

object BuildSettings {

  // Basic settings for our app
  lazy val basicSettings = Seq[Setting[_]](
    organization  := "com.github.piotrga",
    description   := "Asynchronous Scala client for Amazon DynamoDB",
    scalaVersion  := "2.11.8",
    crossScalaVersions := Seq("2.11.8", "2.10.6"),
    scalacOptions := Seq("-deprecation", "-feature", "-encoding", "utf8"),
    resolvers     ++= Dependencies.resolutionRepos
  )

  // Publish settings
  lazy val publishSettings = Seq[Setting[_]](
    publishMavenStyle := true,
    licenses  += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
  )

  lazy val buildSettings = basicSettings ++ publishSettings
}