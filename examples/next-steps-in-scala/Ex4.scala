/*
 * Copyright (C) 2007-2019 Artima, Inc. All rights reserved.
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
 *
 * Example code from:
 *
 * Programming in Scala, Fifth Edition
 * by Martin Odersky, Lex Spoon, Bill Venners, and Frank Sommers
 *
 * http://booksites.artima.com/programming_in_scala_5ed
 */

package org.stairwaybook.nextstepsinscala

object Ex4 {
  def main(args: Array[String]): Unit = {
    // Step 12. Transform with map and for-yield
    val adjactives = List("One", "Two", "Red", "Blue")
    val nouns = adjactives.map(adj => adj + " Fish")
    println(nouns)
    val nouns2 =
      for adj <- adjactives yield
        adj + " Fish"
    println(nouns2)

    val lengths = nouns.map(noun => noun.length)
    val lengths2 =
      for noun <- nouns yield
        noun.length
    println(lengths)
    println(lengths2)

    val ques = Vector("Who", "What", "When", "Where", "Why")
    val usingMap = ques.map(q => q.toLowerCase + "?")
    val usingForYield =
      for q <- ques yield
        q.toLowerCase + "?"
    println(usingMap)
    println(usingForYield)

    val startsW = ques.find(q => q.startsWith("W"))
    val hasLen4 = ques.find(q => q.length == 4)
    val hasLen5 = ques.find(q => q.length == 5)
    val startsH = ques.find(q => q.startsWith("H"))
    print(startsW, hasLen4, hasLen5, startsH)
    println()

    val optionMap = startsW.map(word => word.toUpperCase)
    val optionYeild = for word <- startsW yield word.toUpperCase
    val optionNone = startsH.map(word => word.toUpperCase)
    val optionNoneYield = for word <- startsH yield word.toUpperCase
    print(optionMap, optionYeild, optionNone, optionNoneYield)
    println()
  }

}
