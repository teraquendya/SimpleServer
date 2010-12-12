/*******************************************************************************
 * Open Source Initiative OSI - The MIT License:Licensing
 * The MIT License
 * Copyright (c) 2010 Charles Wagner Jr. (spiegalpwns@gmail.com)
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 ******************************************************************************/
package simpleserver.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import simpleserver.Config;

public abstract class PropertiesConfig extends Config {
  private String header;
  private Properties properties;

  public PropertiesConfig(String filename) {
    super(filename);

    loadDefaultHeader();
    loadDefault();
  }

  @Override
  public void load() {
    try {
      InputStream stream = new FileInputStream(getFile());
      try {
        properties.load(stream);
      }
      finally {
        stream.close();
      }
    }
    catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to load " + getFilename());
    }
  }

  @Override
  public void save() {
    try {
      OutputStream stream = new FileOutputStream(getFile());
      try {
        properties.store(stream, header);
      }
      finally {
        stream.close();
      }
    }
    catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to save " + getFilename());
    }
  }

  protected String getProperty(String key) {
    return properties.getProperty(key);
  }

  protected String setProperty(String key, String value) {
    return (String) properties.setProperty(key, value);
  }

  protected Set<Entry<Object, Object>> entrySet() {
    return properties.entrySet();
  }
  
  protected Set<Object> keySet() {
    return properties.keySet();
  }

  private void loadDefaultHeader() {
    InputStream headerStream = getHeaderResourceStream();
    try {
      header = readFully(headerStream);
    }
    finally {
      try {
        headerStream.close();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
    }

    if (header == null) {
      System.out.println("Failed to load default header for " + getFilename());
    }
  }

  private void loadDefault() {
    InputStream stream = getResourceStream();
    properties = new Properties();
    try {
      try {
        properties.load(stream);
      }
      finally {
        stream.close();
      }
    }
    catch (IOException e) {
      e.printStackTrace();
      System.out.println("Failed to load defaults for " + getFilename());
    }
  }
}
