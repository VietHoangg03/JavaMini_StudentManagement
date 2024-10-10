<h1>JavaMini_StudentManagement</h1>

    <h2>Giới thiệu</h2>
    <p><strong>JavaMini_StudentManagement</strong> là một ứng dụng Java cơ bản để quản lý thông tin sinh viên. Dự án này được phát triển nhằm mục đích rèn luyện các kỹ năng về lập trình Java, đặc biệt là các thao tác liên quan đến <strong>đọc và ghi file</strong>. Người dùng có thể thêm, xóa, sửa thông tin sinh viên và lưu trữ dữ liệu vào file.</p>

    <h2>Chức năng chính</h2>
    <ul>
        <li><strong>Thêm sinh viên</strong>: Người dùng có thể thêm thông tin sinh viên mới, bao gồm mã sinh viên, tên, quê quán, ngày sinh, giới tính và điểm số của các môn học.</li>
        <li><strong>Cập nhật thông tin sinh viên</strong>: Cho phép người dùng sửa đổi thông tin sinh viên đã có.</li>
        <li><strong>Xóa sinh viên</strong>: Xóa thông tin sinh viên khỏi danh sách.</li>
        <li><strong>Hiển thị danh sách sinh viên</strong>: Hiển thị thông tin tất cả sinh viên hiện có.</li>
        <li><strong>Lưu thông tin sinh viên vào file</strong>: Ứng dụng hỗ trợ lưu dữ liệu sinh viên vào file với định dạng cụ thể (sử dụng kỹ thuật đọc ghi file trong Java).</li>
        <li><strong>Đọc dữ liệu từ file</strong>: Cho phép người dùng tải dữ liệu sinh viên đã lưu từ file vào ứng dụng.</li>
    </ul>

    <h2>Các kiến thức chính</h2>
    <ul>
        <li><strong>Đọc và ghi file</strong>:
            <ul>
                <li>Sử dụng các lớp <code>FileReader</code>, <code>FileWriter</code>, <code>BufferedReader</code>, và <code>BufferedWriter</code> để thực hiện các thao tác đọc và ghi dữ liệu từ/đến file.</li>
                <li>Lưu trữ thông tin sinh viên dưới dạng chuỗi, với các trường dữ liệu được ngăn cách bởi ký tự phân cách như <code>;</code>.</li>
                <li>Đảm bảo xử lý ngoại lệ khi thao tác với file, bao gồm các lỗi <code>IOException</code>, <code>FileNotFoundException</code>.</li>
            </ul>
        </li>
        <li><strong>Swing (Giao diện đồ họa)</strong>:
            <ul>
                <li>Sử dụng thư viện <code>Swing</code> để xây dựng giao diện cho ứng dụng quản lý sinh viên, cho phép người dùng tương tác với chương trình thông qua các thành phần GUI như bảng (<code>JTable</code>), hộp thoại (<code>JOptionPane</code>), và các nút bấm (<code>JButton</code>).</li>
            </ul>
        </li>
        <li><strong>Xử lý ngoại lệ (Exception Handling)</strong>:
            <ul>
                <li>Ứng dụng xử lý các ngoại lệ liên quan đến việc đọc ghi file, đảm bảo chương trình không bị gián đoạn khi gặp lỗi.</li>
            </ul>
        </li>
        <li><strong>OOP (Lập trình hướng đối tượng)</strong>:
            <ul>
                <li>Mô hình hóa sinh viên bằng các lớp Java (ví dụ: <code>ThiSinh</code>, <code>Tinh</code>).</li>
                <li>Tách biệt các chức năng logic và giao diện (giao diện đồ họa Swing).</li>
            </ul>
        </li>
    </ul>

    <h2>Hướng dẫn cài đặt và sử dụng</h2>

    <h3>Yêu cầu hệ thống</h3>
    <ul>
        <li>Java JDK 8 trở lên</li>
        <li>IDE hỗ trợ Java như IntelliJ IDEA, Eclipse, hoặc NetBeans</li>
    </ul>

    <h3>Cài đặt</h3>
    <ol>
        <li>Clone repository từ GitHub:
            <pre><code>git clone https://github.com/username/JavaMini_StudentManagement.git</code></pre>
        </li>
        <li>Mở dự án trong IDE của bạn.</li>
        <li>Chạy dự án:
            <ul>
                <li>Tìm class có phương thức <code>main()</code> (ví dụ: <code>Main.java</code> trong package <code>main</code>).</li>
                <li>Chạy ứng dụng từ IDE của bạn.</li>
            </ul>
        </li>
    </ol>

    <h3>Sử dụng</h3>
    <ul>
        <li><strong>Thêm sinh viên</strong>: Chọn chức năng "Thêm sinh viên" để nhập thông tin sinh viên mới.</li>
        <li><strong>Cập nhật sinh viên</strong>: Chọn sinh viên từ danh sách và chọn chức năng "Sửa" để cập nhật thông tin.</li>
        <li><strong>Xóa sinh viên</strong>: Chọn sinh viên từ danh sách và chọn "Xóa".</li>
        <li><strong>Lưu dữ liệu</strong>: Sử dụng chức năng "Lưu file" để lưu trữ thông tin sinh viên vào file.</li>
        <li><strong>Tải dữ liệu</strong>: Sử dụng chức năng "Mở file" để tải lại dữ liệu đã lưu từ file.</li>
    </ul>

    <h2>Build ứng dụng thành <code>.exe</code>, <code>.pkg</code>, <code>.dmg</code></h2>

    <p>Dưới đây là hướng dẫn để bạn build ứng dụng thành tệp thực thi trên Windows (tệp <code>.exe</code>) và macOS (tệp <code>.pkg</code> và <code>.dmg</code>) bằng cách sử dụng công cụ <strong>jpackage</strong> (yêu cầu JDK 14 trở lên).</p>

    <h3>Trên Windows (Tạo tệp <code>.exe</code>)</h3>
    <ol>
        <li><strong>Cài đặt WiX Toolset</strong>:
            <ul>
                <li>Tải và cài đặt <strong>WiX Toolset</strong> từ <a href="https://wixtoolset.org/">trang web WiX Toolset</a>.</li>
                <li>Sau khi cài đặt WiX Toolset, hãy đảm bảo rằng WiX Toolset đã được thêm vào biến môi trường <code>PATH</code>.</li>
            </ul>
        </li>
        <li><strong>Chạy <code>jpackage</code> để tạo file <code>.exe</code></strong>:
            <pre><code>jpackage --name PhanMemQuanLyThiSinh --input . --main-jar "Phần mềm quản lý thí sinh 1.1.jar" --main-class main.Main --type exe</code></pre>
            <p>Lệnh này sẽ tạo ra một tệp <code>.exe</code> có tên là <code>PhanMemQuanLyThiSinh.exe</code>, có thể được sử dụng để cài đặt và chạy ứng dụng trên Windows.</p>
        </li>
    </ol>

    <h3>Trên macOS (Tạo tệp <code>.pkg</code> và <code>.dmg</code>)</h3>
    <ol>
        <li><strong>Sử dụng <code>jpackage</code> để tạo file <code>.pkg</code></strong>:
            <pre><code>jpackage --name PhanMemQuanLyThiSinh --input . --main-jar "Phần mềm quản lý thí sinh 1.1.jar" --main-class main.Main --type pkg</code></pre>
            <p>File <code>.pkg</code> này có thể cài đặt ứng dụng trên macOS.</p>
        </li>
        <li><strong>Tạo tệp <code>.dmg</code></strong>:
            <pre><code>jpackage --name PhanMemQuanLyThiSinh --input . --main-jar "Phần mềm quản lý thí sinh 1.1.jar" --main-class main.Main --type dmg</code></pre>
            <p>File <code>.dmg</code> có thể được sử dụng để phân phối ứng dụng trên macOS.</p>
        </li>
    </ol>
