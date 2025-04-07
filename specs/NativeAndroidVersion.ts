import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';

export interface Spec extends TurboModule {
    getVersion(): Promise<string>;
}

export default TurboModuleRegistry.getEnforcing<Spec>('NativeAndroidVersion') as Spec;