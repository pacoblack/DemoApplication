// IAshmemMMKV.aidl
package com.github.gang.mmkv.demo;
import com.github.gang.mmkv.ParcelableMMKV;
// Declare any non-default types here with import statements

interface IAshmemMMKV {
    ParcelableMMKV GetAshmemMMKV();
}