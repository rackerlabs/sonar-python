/*
 * SonarQube Python Plugin
 * Copyright (C) 2011 SonarSource and Waleri Enns
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.python.flake8;

class Issue {

  private final String filename;
  private final int line;
  private final String ruleId;
  private final String descr;

  Issue(String filename, int line, String ruleId, String descr) {
    this.filename = filename;
    this.line = line;
    this.ruleId = ruleId;
    this.descr = descr;
  }

  @Override
  public String toString() {
    return "(" + filename + ", " + line + ", " + ruleId + ", " + descr + ")";
  }

  String getFilename() {
    return filename;
  }

  int getLine() {
    return line;
  }

  String getRuleId() {
    return ruleId;
  }

  String getDescr() {
    return descr;
  }
}
