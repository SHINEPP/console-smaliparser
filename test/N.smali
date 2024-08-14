.class public final Lcom/mars/opt/N1;
.super Ljava/lang/Object;
.source "SourceFile"

.implements Landroid/os/Parcelable;


# interfaces
.implements Landroid/os/Parcelable;

# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
#.field public static final INSTANCE:Lcom/mars/opt/N;

# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mars/opt/N;

    invoke-direct {v0}, Lcom/mars/opt/N;-><init>()V

    sput-object v0, Lcom/mars/opt/N;->INSTANCE:Lcom/mars/opt/N;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native f(Ljava/lang/String;)I
.end method

.method public final native m(Ljava/lang/String;)V
.end method

.method public final native n(Landroid/content/Context;)V
.end method

.method public final native o()V
.end method
