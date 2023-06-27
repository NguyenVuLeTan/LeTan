package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controller.QLSachController;

public class QLPhieuMuonTra implements QuanLyThuVien {


List<PhieuMuon>listPhieuMuon;

	public QLPhieuMuonTra(List<PhieuMuon> listPhieuMuon) {

		super();
		this.listPhieuMuon = listPhieuMuon;
	}

	public List<PhieuMuon> getListPhieuMuon() {
		return listPhieuMuon;
	}

	public void setListPhieuMuon(List<PhieuMuon> listPhieuMuon) {
		this.listPhieuMuon = listPhieuMuon;
	}
	

	public List<Object> timKiemTheoID(String id) {
		// TODO Auto-generated method stub
		List<Object> ketQuaTimKiem = new ArrayList<>();
		for (PhieuMuon phieuMuon : listPhieuMuon) {
			if (phieuMuon.getiD().equals(id)) {
				ketQuaTimKiem.add(phieuMuon);
			}
		}

		return ketQuaTimKiem;
	}

	public List<Object> timKiemTheoTen(String ten) {
		// TODO Auto-generated method stub
		List<Object> ketQuaTimKiem = new ArrayList<>();
		for (PhieuMuon phieuMuon : listPhieuMuon) {
			if (phieuMuon.getTenPhieu().equalsIgnoreCase(ten)) {
				ketQuaTimKiem.add(phieuMuon);
			}
		}
		return ketQuaTimKiem;
	}

	@Override
	public void them(Object object) {
		PhieuMuon phieuMuon = (PhieuMuon) object;
		getListPhieuMuon().add(phieuMuon);
	}
	
	@Override
	public void xoa(String id) {
		List<Object> phieuMuon = timKiemTheoID(id);
		if(phieuMuon !=null) {
			listPhieuMuon.remove(phieuMuon);
		}		
	}

	@Override
	public void capNhatPhieu(String idPhieu, List<Sach> listSachMuonMoi, Date ngayMuonMoi, Date ngayDuKienTraMoi) {
		PhieuMuon phieuMuon = (PhieuMuon) timKiemTheoID(idPhieu);
		if(phieuMuon != null) {
			if(phieuMuon.getTrangThai().equals("Da Tra Sach")) {
				phieuMuon.setListSachMuon(listSachMuonMoi);
				phieuMuon.setNgayMuon(ngayMuonMoi);
				phieuMuon.setNgayDuKienTra(ngayDuKienTraMoi);
			}
		}

	}
	
	@Override
	public int getTongSoLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSoLuong(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void capNhat(String id) {
		// TODO Auto-generated method stub
		
	}
}