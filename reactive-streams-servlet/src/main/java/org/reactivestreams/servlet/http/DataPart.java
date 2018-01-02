/************************************************************************
 * Licensed under Public Domain (CC0)                                    *
 *                                                                       *
 * To the extent possible under law, the person who associated CC0 with  *
 * this code has waived all copyright and related or neighboring         *
 * rights to this code.                                                  *
 *                                                                       *
 * You should have received a copy of the CC0 legalcode along with this  *
 * work. If not, see <http://creativecommons.org/publicdomain/zero/1.0/>.*
 ************************************************************************/
package org.reactivestreams.servlet.http;

/**
 * A streamed part that is buffered in memory.
 */
public interface DataPart extends StreamedPart {

  /**
   * Get the data for this part.
   */
  String getData();

  /**
   * Unsupported operation, data parts never have a file name.
   */
  @Override
  default String getSubmittedFileName() {
    throw new UnsupportedOperationException("Data parts do not have a file name.");
  }
}
