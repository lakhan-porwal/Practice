package in.co.rays.library;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.rays.util.JDBCDataSource;

public class LibraryModel {

	public void add(LibraryBean bean) throws Exception {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement("insert into librarymodule values (?,?,?,?,?)");

			pstmt.setLong(1, bean.getLibraryId());
			pstmt.setString(2, bean.getLibraryName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setInt(4, bean.getTotalBooks());
			pstmt.setString(5, bean.getContactNo());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record insert successfully" + i);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void update(LibraryBean bean) throws Exception {

		Connection conn = null;

		try {

			conn = JDBCDataSource.getConnection();

			conn.setAutoCommit(false);

			PreparedStatement pstmt = conn.prepareStatement(
					"UPDATE librarymodule SET library_name=?, address=?, total_books=?, contact_no=? WHERE library_id=?");

			pstmt.setString(1, bean.getLibraryName());
			pstmt.setString(2, bean.getAddress());
			pstmt.setInt(3, bean.getTotalBooks());
			pstmt.setString(4, bean.getContactNo());
			pstmt.setLong(5, bean.getLibraryId());

			int i = pstmt.executeUpdate();

			conn.commit();

			System.out.println("Record update successfully" + i);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
	
	public void delete(long id) throws Exception {

	    Connection conn = null;

	    try {

	        conn = JDBCDataSource.getConnection();
	        conn.setAutoCommit(false);

	        PreparedStatement pstmt = conn.prepareStatement(
	                "DELETE FROM librarymodule WHERE library_id=?");

	        pstmt.setLong(1, id);

	        int i = pstmt.executeUpdate();

	        conn.commit();

	        System.out.println("Record deleted successfully " + i);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
