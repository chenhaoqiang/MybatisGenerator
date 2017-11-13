package org.mybatis.generator;

public class Test {
	public static void main(String[] args) {
		test(new String[] { "ds_approve_log", "ds_download_log", "ds_encode_item", "ds_encode_type", "ds_info_item", "ds_info_type", "ds_version_control", "ds_version_statistics"});
	}

	private static void test(String[] tableNames) {
		for (String tn : tableNames) {
			StringBuilder sb = new StringBuilder();
			sb.append("<table tableName=\"");
			sb.append(tn);
			sb.append("\" enableCountByExample=\"false\" enableUpdateByExample=\"false\" enableDeleteByExample=\"false\" enableSelectByExample=\"false\" selectByExampleQueryId=\"false\" />");
			System.out.println(sb.toString());
		}
	}
}
