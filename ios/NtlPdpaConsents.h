
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNNtlPdpaConsentsSpec.h"

@interface NtlPdpaConsents : NSObject <NativeNtlPdpaConsentsSpec>
#else
#import <React/RCTBridgeModule.h>

@interface NtlPdpaConsents : NSObject <RCTBridgeModule>
#endif

@end
