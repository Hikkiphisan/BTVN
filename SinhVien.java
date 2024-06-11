
    public class SinhVien {
        private String maSV;
        private String tenSV;
        private int tuoi;

        public SinhVien(String maSV, String tenSV, int tuoi) {
            this.maSV = maSV;
            this.tenSV = tenSV;
            this.tuoi = tuoi;
        }
        public SinhVien(String maSV) {
            this.maSV = maSV;
        }

        public String getMaSV() {
            return maSV;
        }

        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }

        public String getTenSV() {
            return tenSV;
        }

        public void setTenSV(String tenSV) {
            this.tenSV = tenSV;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        @Override
        public String toString() {
            return "SinhVien{" +
                    "maSV='" + maSV + '\'' +
                    ", tenSV='" + tenSV + '\'' +
                    ", tuoi=" + tuoi +
                    '}';
        }
    }
