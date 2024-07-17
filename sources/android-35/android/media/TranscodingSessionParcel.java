/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version 29 --ninja -d out/soong/.intermediates/frameworks/av/media/module/libmediatranscoding/mediatranscoding_aidl_interface-java-source/gen/android/media/TranscodingSessionParcel.java.d -o out/soong/.intermediates/frameworks/av/media/module/libmediatranscoding/mediatranscoding_aidl_interface-java-source/gen -Nframeworks/av/media/module/libmediatranscoding/aidl frameworks/av/media/module/libmediatranscoding/aidl/android/media/TranscodingSessionParcel.aidl
 */
package android.media;
/**
 * TranscodingSession is generated by the MediaTranscodingService upon receiving a
 * TranscodingRequest. It contains all the necessary configuration generated by the
 * MediaTranscodingService for the TranscodingRequest.
 * 
 * {@hide}
 */
//TODO(hkuang): Implement the parcelable.
public class TranscodingSessionParcel implements android.os.Parcelable
{
  /** A unique positive Id generated by the MediaTranscodingService. */
  public int sessionId = 0;
  /** The request associated with the TranscodingSession. */
  public android.media.TranscodingRequestParcel request;
  /**
   * Output video track's format. This will only be avaiable for video transcoding and it will
   * be avaiable when the session is finished.
   */
  public android.media.TranscodingVideoTrackFormat videoTrackFormat;
  /**
   * Current number of sessions ahead of this session. The service schedules the session based on
   * the priority passed from the client. Client could specify whether to receive updates when the
   * awaitNumberOfSessions changes through setting requestProgressUpdate in the TranscodingRequest.
   */
  public int awaitNumberOfSessions = 0;
  public static final android.os.Parcelable.Creator<TranscodingSessionParcel> CREATOR = new android.os.Parcelable.Creator<TranscodingSessionParcel>() {
    @Override
    public TranscodingSessionParcel createFromParcel(android.os.Parcel _aidl_source) {
      TranscodingSessionParcel _aidl_out = new TranscodingSessionParcel();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public TranscodingSessionParcel[] newArray(int _aidl_size) {
      return new TranscodingSessionParcel[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(sessionId);
    _aidl_parcel.writeTypedObject(request, _aidl_flag);
    _aidl_parcel.writeTypedObject(videoTrackFormat, _aidl_flag);
    _aidl_parcel.writeInt(awaitNumberOfSessions);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sessionId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      request = _aidl_parcel.readTypedObject(android.media.TranscodingRequestParcel.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      videoTrackFormat = _aidl_parcel.readTypedObject(android.media.TranscodingVideoTrackFormat.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      awaitNumberOfSessions = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(request);
    _mask |= describeContents(videoTrackFormat);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
