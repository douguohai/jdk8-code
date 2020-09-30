/*
 * Copyright (c) 2000, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;

/**
* The Holder for <tt>WrongTransaction</tt>.  For more information on
* Holder files, see <a href="doc-files/generatedfiles.html#holder">
* "Generated Files: Holder Files"</a>.<P>
* org/omg/CORBA/WrongTransactionHolder.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from CORBA.idl
* Thursday, August 24, 2000 5:32:50 PM PDT
*/

public final class WrongTransactionHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.WrongTransaction value = null;

  public WrongTransactionHolder ()
  {
  }

  public WrongTransactionHolder (org.omg.CORBA.WrongTransaction initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.WrongTransactionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.WrongTransactionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.WrongTransactionHelper.type ();
  }

}
