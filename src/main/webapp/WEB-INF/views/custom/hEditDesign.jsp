<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" href="/css/hEdit.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/dom-to-image/2.6.0/dom-to-image.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/FileSaver.js/2.0.2/FileSaver.min.js"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/templatemo.css" />
<link rel="stylesheet" type="text/css" href="/css/header_footer.css" />

<header>
    <nav>
        <div class="row">
            <img
                    src="/img/Shoetudio_logo.png"
                    alt="Shoetudio"
                    class="logo"
            />
            <ul class="main-nav">
                <li>
                    <a
                            href="/Users/josephlee/Desktop/shoetudio_team_project/teamproject/about_us.html"
                    >About Us</a
                    >
                </li>
                <li><a href="#">Custom</a></li>
                <li><a href="#">Artist</a></li>
                <li><a href="/Users/josephlee/Desktop/shoetudio_team_project/teamproject/board/list.html">Community</a></li>
            </ul>
        </div>
    </nav>
</header>


<section class="bg-light">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 mt-5">
                <div class="row">

                    <div class="col-md-10 bg-light">
                        <section class="py-3" id="image">
                            <div id="CSlider">
                                <div>
                                    <div id="rmypattern1" class="pattern3"></div>
                                    <div id="tmypattern1" class="pattern2"></div>
                                    <div id="mypattern1" class="pattern"></div>
                                    <div id="mycanvas1" class="canvas"></div>
                                </div>
                                <div>
                                    <div id="rmypattern2" class="pattern3"></div>
                                    <div id="tmypattern2" class="pattern2"></div>
                                    <div id="mypattern2" class="pattern"></div>
                                    <div id="mycanvas2" class="canvas"></div>
                                </div>
                                <div>
                                    <div id="rmypattern3" class="pattern3"></div>
                                    <div id="tmypattern3" class="pattern2"></div>
                                    <div id="mypattern3" class="pattern"></div>
                                    <div id="mycanvas3" class="canvas"></div>
                                </div>
                                <div>
                                    <div id="rmypattern4" class="pattern3"></div>
                                    <div id="tmypattern4" class="pattern2"></div>
                                    <div id="mypattern4" class="pattern"></div>
                                    <div id="mycanvas4" class="canvas"></div>
                                </div>
                            </div>
                        </section>
                    </div>

                    <div class="col-md-2 bg-dark">
                        <div class="row">
                            <ul class="list-unstyled templatemo-accordion">
                                <li class="pb-3">
                                    <a class="collapsed d-flex justify-content-between h3 text-decoration-none">
                            <div class="col-md-10 offset-1">
                                    <img class="card-img img-fluid" src="/i/Pattern/Hbody.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">Body</p>
                            </div>
                                    </a>

                                    <ul class="collapse show list-unstyled pl-3">
                            <div class="col-md-10">
                                <li> <a id="cow">
                                    <img class="card-img img-fluid" src="/i/Pattern/cow.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">Cow</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li> <a id="green">
                                    <img class="card-img img-fluid" src="/i/Pattern/Green.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">green</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li><a id="dinosaur">
                                    <img class="card-img img-fluid" src="/i/Pattern/dino.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">dinosaur</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li> <a id="reset1" onclick="RersetPattern()">
                                    <img class="card-img img-fluid" src="/i/Pattern/reset.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">Reset</p></a></li>
                            </div>
                                    </ul>
                                </li>

                            <hr class="col-10" style="background-color: #fffb00">

                                <li class="pb-3">
                                <a class="collapsed d-flex justify-content-between h3 text-decoration-none">
                                    <div class="col-md-10 offset-1">
                                <img class="card-img img-fluid" src="/i/Pattern/Htongue.png" alt="Card image cap" style="cursor: pointer">
                                <p class="text-light" style="text-align: center">Tongue</p>
                            </div>
                                </a>
                                    <ul class="collapse show list-unstyled pl-3">
                            <div class="col-md-10">
                                <li><a id="T_dinosaur">
                                    <img class="card-img img-fluid" src="/i/Pattern/dino.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">T_dinosaur</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li>  <a id="T_sky">
                                    <img class="card-img img-fluid" src="/i/Pattern/sky.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">T_sky</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li> <a id="reset2" onclick="T_RersetPattern()">
                                    <img class="card-img img-fluid" src="/i/Pattern/reset.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">Reset</p></a></li>
                            </div>
                            </ul>
                            </li>

                            <hr class="col-10" style="background-color: #fffb00">


                                <li class="pb-3">
                                    <a class="collapsed d-flex justify-content-between h3 text-decoration-none">
                            <div class="col-md-10 offset-1">
                                <img class="card-img img-fluid" src="/i/Pattern/Hrubber.png" alt="Card image cap" style="cursor: pointer">
                                <p class="text-light" style="text-align: center">Rubber</p>
                            </div>
                                    </a>
                        <ul class="collapse show list-unstyled pl-3">
                            <div class="col-md-10">
                                <li><a id="R_black">
                                    <img class="card-img img-fluid" src="/i/Pattern/black.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">R_black</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li> <a id="R_Vintage">
                                    <img class="card-img img-fluid" src="/i/Pattern/vintage.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">R_vintage</p></a></li>
                            </div>

                            <div class="col-md-10">
                                <li> <a id="reset3" onclick="R_RersetPattern()">
                                    <img class="card-img img-fluid" src="/i/Pattern/reset.png" alt="Card image cap" style="cursor: pointer">
                                    <p class="text-light" style="text-align: center">Reset</p></a></li>
                            </div>
                        </ul>
                        </li>
                            <hr class="col-10" style="background-color: #fffb00">

                            <div class="col-md-10 offset-1">
                                <button type="button" class="btn btn-success" id="saveBtn">Edit Save</button>
                            </div>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<footer>
    <div class="row">
        <div class="col span-1-of-2">
            <ul class="footer-nav">
                <li>
                    <a
                            href="/Users/josephlee/Desktop/shoetudio_team_project/teamproject/index(final).html"
                    >Home</a
                    >
                </li>
                <li>
                    <a
                            href="/Users/josephlee/Desktop/shoetudio_team_project/teamproject/about_us.html"
                    >About Us</a
                    >
                </li>
                <li><a href="#">Custom</a></li>
                <li><a href="#">Artists</a></li>
                <li><a href="#">Community</a></li>
            </ul>
        </div>
        <div class="col span-1-of-2">
            <ul class="social-icons">
                <li>
                    <a href="#"><i class="ion-social-facebook"></i></a>
                </li>
                <li>
                    <a href="#"><i class="ion-social-twitter"></i></a>
                </li>
                <li>
                    <a href="#"><i class="ion-social-googleplus"></i></a>
                </li>
                <li>
                    <a href="#"><i class="ion-social-instagram"></i></a>
                </li>
            </ul>
        </div>
    </div>
    <div class="row">
        <p>Copyright &copy; 2021 by Shoetudio. All rights reserved.</p>
    </div>
</footer>


<!-- 사진 저장 스크립트 시작 -->
<script>
    document.getElementById('saveBtn').onclick = function(){
        domtoimage.toBlob(document.getElementById('image'))
            .then(function (blob) {
                window.saveAs(blob, 'CustomImage_SHOETUDIO.png');
            });
    }
</script>
<!-- 사진 저장 스크립트 종료 -->



