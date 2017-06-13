package clinic;


/**
* clinic/_ClinicInterfaceStub.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从C:/Users/k2ggg/workspace/CORBA/src/clinicClient/clinic.idl
* 2016年7月3日 星期日 下午11时45分54秒 EDT
*/

public class _ClinicInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements clinic.ClinicInterface
{

  public int createDRecord (String managerID, String firstName, String lastName, String address, String phone, String specialization, String location)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createDRecord", true);
                $out.write_string (managerID);
                $out.write_string (firstName);
                $out.write_string (lastName);
                $out.write_string (address);
                $out.write_string (phone);
                $out.write_string (specialization);
                $out.write_string (location);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createDRecord (managerID, firstName, lastName, address, phone, specialization, location        );
            } finally {
                _releaseReply ($in);
            }
  } // createDRecord

  public int createNRecord (String managerID, String firstName, String lastName, String designation, String status, String statusDate)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("createNRecord", true);
                $out.write_string (managerID);
                $out.write_string (firstName);
                $out.write_string (lastName);
                $out.write_string (designation);
                $out.write_string (status);
                $out.write_string (statusDate);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return createNRecord (managerID, firstName, lastName, designation, status, statusDate        );
            } finally {
                _releaseReply ($in);
            }
  } // createNRecord

  public int verifyManagerID (String id)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("verifyManagerID", true);
                $out.write_string (id);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return verifyManagerID (id        );
            } finally {
                _releaseReply ($in);
            }
  } // verifyManagerID

  public int editRecord (String managerID, String recordID, String fieldName, String newValue)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("editRecord", true);
                $out.write_string (managerID);
                $out.write_string (recordID);
                $out.write_string (fieldName);
                $out.write_string (newValue);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return editRecord (managerID, recordID, fieldName, newValue        );
            } finally {
                _releaseReply ($in);
            }
  } // editRecord

  public int transferRecord (String managerID, String ID, String remoteName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("transferRecord", true);
                $out.write_string (managerID);
                $out.write_string (ID);
                $out.write_string (remoteName);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return transferRecord (managerID, ID, remoteName        );
            } finally {
                _releaseReply ($in);
            }
  } // transferRecord

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:clinic/ClinicInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ClinicInterfaceStub
