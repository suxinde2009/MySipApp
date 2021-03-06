/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class WindowHandle {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected WindowHandle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WindowHandle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_WindowHandle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWindow(SWIGTYPE_p_void value) {
    pjsua2JNI.WindowHandle_window_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getWindow() {
    long cPtr = pjsua2JNI.WindowHandle_window_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setDisplay(SWIGTYPE_p_void value) {
    pjsua2JNI.WindowHandle_display_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getDisplay() {
    long cPtr = pjsua2JNI.WindowHandle_display_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public WindowHandle() {
    this(pjsua2JNI.new_WindowHandle(), true);
  }

}
