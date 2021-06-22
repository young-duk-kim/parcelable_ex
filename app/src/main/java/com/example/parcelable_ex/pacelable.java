package com.example.parcelable_ex;

import android.os.Parcel;
import android.os.Parcelable;

public class pacelable implements Parcelable {
    int num;
    String msg;

    public pacelable(int num, String msg){
        this.num = num;
        this.msg = msg;
    }

    public pacelable(Parcel in){
        num = in.readInt();
        msg = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        @Override
        public pacelable createFromParcel(Parcel source) {
            return new pacelable(source);
        }

        @Override
        public pacelable[] newArray(int size) {
            return new pacelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(num);
        dest.writeString(msg);
    }
}
