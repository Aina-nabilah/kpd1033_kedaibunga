<!DOCTYPE html>
<html>
    <head>
        <title>Kedai Bunga XYZ</title>
    </head>
    <script>
        function tambahketroli() {
            //Kode untuk menguruskan tindakan tambah ke troli
            alert ('Produk telah ditambah ke troli!')
        }
    </script>
    <body>
        <h1> Selamat Datang ke Kedai Bunga XYZ</h1>
        <h2> Senarai Produk</h2>
        <div class = "produk">
            <img src = "pngtree-bright-red-rose-flowers-in-spring-image_560212.jpg" alt = "Bunga Mawar" width="200px" height="200px">
            <h3>Bunga Mawar</h3>
            <p> Harga RM10.00</p>
            <button onclick="tambahketroli()"> Tambah ke Troli</button>
        </div>
        <div class = "produk">
            <img src = "orkid8.jpg" alt = "Bunga Anggrek" width="200px">
            <h3>Bunga Anggrek</h3>
            <p>RM 15.00</p>
            <button onclick="tambahketroli()">Tambah ke Troli</button>
        </div>
        <!--menambahkan produk lain-->
        <div class = "produk">
            <img src = "pngtree-yellow-chrysanthemum-flower-picture-image_2652452.jpg" alt = "Bunga Kekwa" width="200px">
            <h3>Bunga Kekwa</h3>
            <p>RM17.00</p>
            <button onclick="tambahketroli()">Tambah ke Troli</button>
        </div>
        <div class = "produk">
            <img src = "iris-gdd2949f0c_1280-1jpg-20211118042541.jpg" alt = "Bunga Iris" width="200px">
            <h3>Bunga Iris</h3>
            <p>RM16.00</p>
            <button onclick="tambahketroli()">Tambah ke Troli</button>
        </div>
    </body>
</html>
