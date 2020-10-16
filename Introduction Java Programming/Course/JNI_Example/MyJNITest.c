#include "MyJNITest.h"

JNIEXPORT jint JNICALL Java_MyJNITest_add(JNIEnv *env, jclass c, jint a, jint b)
{
	return a + b;
}
