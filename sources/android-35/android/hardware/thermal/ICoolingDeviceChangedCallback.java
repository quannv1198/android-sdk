/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java --structured --version 2 --hash 2f49c78011338b42b43d5d0e250d9b520850cc1f -t --stability vintf --min_sdk_version platform_apis --ninja -d out/soong/.intermediates/hardware/interfaces/thermal/aidl/android.hardware.thermal-V2-java-source/gen/android/hardware/thermal/ICoolingDeviceChangedCallback.java.d -o out/soong/.intermediates/hardware/interfaces/thermal/aidl/android.hardware.thermal-V2-java-source/gen -Nhardware/interfaces/thermal/aidl/aidl_api/android.hardware.thermal/2 hardware/interfaces/thermal/aidl/aidl_api/android.hardware.thermal/2/android/hardware/thermal/ICoolingDeviceChangedCallback.aidl
 */
package android.hardware.thermal;
/** @hide */
public interface ICoolingDeviceChangedCallback extends android.os.IInterface
{
  /**
   * The version of this interface that the caller is built against.
   * This might be different from what {@link #getInterfaceVersion()
   * getInterfaceVersion} returns as that is the version of the interface
   * that the remote object is implementing.
   */
  public static final int VERSION = 2;
  public static final String HASH = "2f49c78011338b42b43d5d0e250d9b520850cc1f";
  /** Default implementation for ICoolingDeviceChangedCallback. */
  public static class Default implements android.hardware.thermal.ICoolingDeviceChangedCallback
  {
    @Override public void notifyCoolingDeviceChanged(android.hardware.thermal.CoolingDevice coolingDevice) throws android.os.RemoteException
    {
    }
    @Override
    public int getInterfaceVersion() {
      return 0;
    }
    @Override
    public String getInterfaceHash() {
      return "";
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.thermal.ICoolingDeviceChangedCallback
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.thermal.ICoolingDeviceChangedCallback interface,
     * generating a proxy if needed.
     */
    public static android.hardware.thermal.ICoolingDeviceChangedCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.thermal.ICoolingDeviceChangedCallback))) {
        return ((android.hardware.thermal.ICoolingDeviceChangedCallback)iin);
      }
      return new android.hardware.thermal.ICoolingDeviceChangedCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    /** @hide */
    public static java.lang.String getDefaultTransactionName(int transactionCode)
    {
      switch (transactionCode)
      {
        case TRANSACTION_notifyCoolingDeviceChanged:
        {
          return "notifyCoolingDeviceChanged";
        }
        case TRANSACTION_getInterfaceVersion:
        {
          return "getInterfaceVersion";
        }
        case TRANSACTION_getInterfaceHash:
        {
          return "getInterfaceHash";
        }
        default:
        {
          return null;
        }
      }
    }
    /** @hide */
    public java.lang.String getTransactionName(int transactionCode)
    {
      return this.getDefaultTransactionName(transactionCode);
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      else if (code == TRANSACTION_getInterfaceVersion) {
        reply.writeNoException();
        reply.writeInt(getInterfaceVersion());
        return true;
      }
      else if (code == TRANSACTION_getInterfaceHash) {
        reply.writeNoException();
        reply.writeString(getInterfaceHash());
        return true;
      }
      switch (code)
      {
        case TRANSACTION_notifyCoolingDeviceChanged:
        {
          android.hardware.thermal.CoolingDevice _arg0;
          _arg0 = data.readTypedObject(android.hardware.thermal.CoolingDevice.CREATOR);
          data.enforceNoDataAvail();
          this.notifyCoolingDeviceChanged(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.thermal.ICoolingDeviceChangedCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      private int mCachedVersion = -1;
      private String mCachedHash = "-1";
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void notifyCoolingDeviceChanged(android.hardware.thermal.CoolingDevice coolingDevice) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(coolingDevice, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyCoolingDeviceChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method notifyCoolingDeviceChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override
      public int getInterfaceVersion() throws android.os.RemoteException {
        if (mCachedVersion == -1) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, data, reply, 0);
            reply.readException();
            mCachedVersion = reply.readInt();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedVersion;
      }
      @Override
      public synchronized String getInterfaceHash() throws android.os.RemoteException {
        if ("-1".equals(mCachedHash)) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceHash, data, reply, 0);
            reply.readException();
            mCachedHash = reply.readString();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedHash;
      }
    }
    static final int TRANSACTION_notifyCoolingDeviceChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
    /** @hide */
    public int getMaxTransactionId()
    {
      return 16777214;
    }
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$thermal$ICoolingDeviceChangedCallback".replace('$', '.');
  public void notifyCoolingDeviceChanged(android.hardware.thermal.CoolingDevice coolingDevice) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
