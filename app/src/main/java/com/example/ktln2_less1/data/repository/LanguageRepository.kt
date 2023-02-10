package com.example.ktln2_less1.data.repository

import com.example.ktln2_less1.data.model.FirstModel

class LanguageRepository {

    private var languageModelList = mutableListOf<FirstModel>()

    fun getListOfLanguages(): MutableList<FirstModel> {
        languageModelList.clear()
        languageModelList.add(
            FirstModel(
                "https://s0.rbk.ru/v6_top_pics/media/img/1/60/756533742439601.jpg",
                "Java"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://cms-assets.tutsplus.com/uploads/users/1499/posts/29590/preview_image/kotlin.jpg",
                "Kotlin"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2.svg/1200px-Unofficial_JavaScript_logo_2.svg.png",
                "javaScript"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo.svg/800px-ISO_C%2B%2B_Logo.svg.png",
                "C++"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Python.svg/800px-Python.svg.png",
                "python"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://play-lh.googleusercontent.com/bRNe2Qm36zr0ZbuZO5BI8uSCrL6rizeVbbI-sf4gIaKJlgk8Qj5v2ZHgK52ubGjvsg",
                "Scala"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://static.wikia.nocookie.net/wikies/images/4/43/Logo-csharp.png/revision/latest/scale-to-width-down/500?cb=20180617092325&path-prefix=ru",
                "C#"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Ruby_logo.svg/1200px-Ruby_logo.svg.png",
                "Ruby"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/PHP-logo.svg/1200px-PHP-logo.svg.png",
                "PHP"
            )
        )
        languageModelList.add(
            FirstModel(
                "https://w7.pngwing.com/pngs/830/332/png-transparent-perl-dynamic-programming-language-scripting-language-computer-programming-perl-mammal-logo-wildlife.png",
                "Perl"
            )
        )
        return languageModelList
    }
}