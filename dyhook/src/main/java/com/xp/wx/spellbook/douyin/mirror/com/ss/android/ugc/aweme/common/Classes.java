package com.xp.wx.spellbook.douyin.mirror.com.ss.android.ugc.aweme.common;

import com.xp.wx.spellbook.douyin.DyGlobal;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\rXD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xp/wx/spellbook/douyin/mirror/com/ss/android/ugc/aweme/common/Classes;", "", "()V", "ClassCommonA", "Ljava/lang/Class;", "getClassCommonA", "()Ljava/lang/Class;", "ClassCommonA$delegate", "Lkotlin/Lazy;", "ClassCommonU", "getClassCommonU", "ClassCommonU$delegate", "childPackage", "", "getChildPackage", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: Classes.kt */
public final class Classes {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Lazy ClassCommonA$delegate;
    private static final Lazy ClassCommonU$delegate;
    public static final Classes INSTANCE = new Classes();
    private static final String childPackage = childPackage;

    public final Class<?> getClassCommonA() {
        Lazy lazy = ClassCommonA$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (Class) lazy.getValue();
    }

    public final Class<?> getClassCommonU() {
        Lazy lazy = ClassCommonU$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Class) lazy.getValue();
    }

    static {
        Lazy lazy;
        Lazy lazy2;
        Class<Classes> cls = Classes.class;
        $$delegatedProperties = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonU", "getClassCommonU()Ljava/lang/Class;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(cls), "ClassCommonA", "getClassCommonA()Ljava/lang/Class;"))};
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy = new DyGlobal.UnitTestLazyImpl(new Classes$$special$$inlined$dyLazy$1("ClassCommonU"));
        } else {
            lazy = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Classes$$special$$inlined$dyLazy$2("ClassCommonU"));
        }
        ClassCommonU$delegate = lazy;
        if (DyGlobal.INSTANCE.getWxUnitTestMode()) {
            lazy2 = new DyGlobal.UnitTestLazyImpl(new Classes$$special$$inlined$dyLazy$3("ClassCommonA"));
        } else {
            lazy2 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Classes$$special$$inlined$dyLazy$4("ClassCommonA"));
        }
        ClassCommonA$delegate = lazy2;
    }

    private Classes() {
    }

    public final String getChildPackage() {
        return childPackage;
    }
}
