import type { TurboModule } from 'react-native';
import { TurboModuleRegistry } from 'react-native';

export type Callback = (err?: any, msg?: string) => void;

export interface Spec extends TurboModule {
  setGrantAnalyticsStorage(callback?: Callback): void;
  setDenyAnalyticsStorage(callback?: Callback): void;
  setGrantAdStorage(callback?: Callback): void;
  setDenyAdStorage(callback?: Callback): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>('NtlPdpaConsents');
