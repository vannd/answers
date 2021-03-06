/*
 * Copyright (C) 2003-2013 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU Affero General Public License
* as published by the Free Software Foundation; either version 3
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.answer.webui;

import java.io.IOException;
import java.io.InputStream;

import org.exoplatform.download.DownloadResource;
import org.exoplatform.faq.service.FileAttachment;

public class FAQDownloadResource extends DownloadResource {
  private FileAttachment fileAttachment;
  
  public FAQDownloadResource(String downloadType, String resourceMimeType) {
    super(resourceMimeType);
  }

  public FileAttachment getFileAttachment() {
    return fileAttachment;
  }

  public void setFileAttachment(FileAttachment fileAttachment) {
    this.fileAttachment = fileAttachment;
  }

  @Override
  public InputStream getInputStream() throws IOException {
    try {
      return fileAttachment.getInputStream();
    } catch (Exception e) {
      return null;
    }
  }

}
