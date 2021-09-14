package com.induse.work_portal.utils

import android.app.Application
import android.widget.Toast
class Extension{


fun mytoast(context : Application, msg : String){
    Toast.makeText(context, "", Toast.LENGTH_LONG).show()
}

}

