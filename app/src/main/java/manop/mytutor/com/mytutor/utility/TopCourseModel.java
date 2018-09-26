package manop.mytutor.com.mytutor.utility;

import android.os.Parcel;
import android.os.Parcelable;

public class TopCourseModel implements Parcelable{
    private String Photo;
    private String uidString;

    public TopCourseModel() {
    }

    public TopCourseModel(String photo, String uidString) {
        Photo = photo;
        this.uidString = uidString;
    }

    protected TopCourseModel(Parcel in) {
        Photo = in.readString();
        uidString = in.readString();
    }

    public static final Creator<TopCourseModel> CREATOR = new Creator<TopCourseModel>() {
        @Override
        public TopCourseModel createFromParcel(Parcel in) {
            return new TopCourseModel(in);
        }

        @Override
        public TopCourseModel[] newArray(int size) {
            return new TopCourseModel[size];
        }
    };

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getUidString() {
        return uidString;
    }

    public void setUidString(String uidString) {
        this.uidString = uidString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Photo);
        dest.writeString(uidString);
    }
}