package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-x64-cygwin/jdk8u341/2692/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, June 16, 2022 3:52:37 PM UTC
*/

public final class ServantAlreadyActive extends org.omg.CORBA.UserException
{

  public ServantAlreadyActive ()
  {
    super(ServantAlreadyActiveHelper.id());
  } // ctor


  public ServantAlreadyActive (String $reason)
  {
    super(ServantAlreadyActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ServantAlreadyActive
