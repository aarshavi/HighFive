/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class jlibmraa_Gpio */

#ifndef _Included_jlibmraa_Gpio
#define _Included_jlibmraa_Gpio
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     jlibmraa_Gpio
 * Method:    loadGpioNative
 * Signature: (IZZ)J
 */
JNIEXPORT jlong JNICALL Java_jlibmraa_Gpio_loadGpioNative
  (JNIEnv *, jclass, jint, jboolean, jboolean);

/*
 * Class:     jlibmraa_Gpio
 * Method:    dir
 * Signature: (Ljlibmraa/Utils/Dir;)I
 */
JNIEXPORT jint JNICALL Java_jlibmraa_Gpio_dir
  (JNIEnv *, jobject, jobject);

/*
 * Class:     jlibmraa_Gpio
 * Method:    write
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_jlibmraa_Gpio_write
  (JNIEnv *, jobject, jint);

#ifdef __cplusplus
}
#endif
#endif
