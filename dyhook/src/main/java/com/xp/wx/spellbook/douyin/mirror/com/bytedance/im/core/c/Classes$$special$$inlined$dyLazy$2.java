package com.xp.wx.spellbook.douyin.mirror.com.bytedance.im.core.c;

import com.xp.wx.spellbook.C;
import com.xp.wx.spellbook.douyin.DyGlobal;
import com.xp.wx.spellbook.parser.ClassTrie;
import com.xp.wx.spellbook.util.ReflectionUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "com/xp/wx/spellbook/douyin/DyGlobal$dyLazy$2"}, k = 3, mv = {1, 1, 13})
/* compiled from: DyGlobal.kt */
public final class Classes$$special$$inlined$dyLazy$2 extends Lambda implements Function0<Class<? extends Object>> {
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Classes$$special$$inlined$dyLazy$2(String str) {
        super(0);
        this.$name = str;
    }

    public final Class<? extends Object> invoke() {
        if (DyGlobal.INSTANCE.getDyVersion() == null) {
            throw new Error("Invalid wxVersion");
        } else if (DyGlobal.INSTANCE.getDyPackageName() == null) {
            throw new Error("Invalid wxPackageName");
        } else if (DyGlobal.INSTANCE.getDyLoader() == null) {
            throw new Error("Invalid wxLoader");
        } else if (DyGlobal.INSTANCE.getDyClasses() != null) {
            ClassLoader dyLoader = DyGlobal.INSTANCE.getDyLoader();
            if (dyLoader == null) {
                Intrinsics.throwNpe();
            }
            ClassTrie dyClasses = DyGlobal.INSTANCE.getDyClasses();
            if (dyClasses == null) {
                Intrinsics.throwNpe();
            }
            Class<?> firstOrNull = ReflectionUtil.findClassesFromPackage$default(dyLoader, dyClasses, Classes.INSTANCE.getChildPackage(), 0, 8, (Object) null).filterByMethod((Class<?>) null, (Class<?>[]) new Class[]{C.INSTANCE.getMap(), C.INSTANCE.getRunnable()}).filterByMethod((Class<?>) C.INSTANCE.getString(), (Class<?>[]) new Class[]{C.INSTANCE.getInt(), C.INSTANCE.getLong()}).filterByMethod((Class<?>) C.INSTANCE.getString(), (Class<?>[]) new Class[]{C.INSTANCE.getLong()}).filterByMethod((Class<?>) C.INSTANCE.getLong(), (Class<?>[]) new Class[]{C.INSTANCE.getString()}).firstOrNull();
            if (firstOrNull != null) {
                return firstOrNull;
            }
            throw new Error("Failed to evaluate " + this.$name);
        } else {
            throw new Error("Invalid wxClasses");
        }
    }
}
