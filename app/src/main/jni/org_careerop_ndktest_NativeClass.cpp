#include <org_careerop_ndktest_NativeClass.h>

JNIEXPORT jstring JNICALL Java_org_careerop_ndktest_NativeClass_getMessageFormJni
  (JNIEnv *evn, jclass obj){
    return evn->NewStringUTF("Hellow Juyel Rana");
}
