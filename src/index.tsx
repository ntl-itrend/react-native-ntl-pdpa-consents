import { NativeModules, Platform } from 'react-native';
import type { Callback } from './NativeNtlPdpaConsents';

const LINKING_ERROR =
  `The package 'react-native-ntl-pdpa-consents' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

// @ts-expect-error
const isTurboModuleEnabled = global.__turboModuleProxy != null;

const NtlPdpaConsentsModule = isTurboModuleEnabled
  ? require('./NativeNtlPdpaConsents').default
  : NativeModules.NtlPdpaConsents;

const NtlPdpaConsents = NtlPdpaConsentsModule
  ? NtlPdpaConsentsModule
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function setGrantAnalyticsStorage(callback?: Callback): void {
  return NtlPdpaConsents.setGrantAnalyticsStorage(callback);
}
export function setDenyAnalyticsStorage(callback?: Callback): void {
  return NtlPdpaConsents.setDenyAnalyticsStorage(callback);
}
export function setGrantAdStorage(callback?: Callback): void {
  return NtlPdpaConsents.setGrantAdStorage(callback);
}
export function setDenyAdStorage(callback?: Callback): void {
  return NtlPdpaConsents.setDenyAdStorage(callback);
}
