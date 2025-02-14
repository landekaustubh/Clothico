import React from 'react'
import "./Navbar.css"
import nav_logo from "../../assets/favicon.ico"
import navProfile from "../../assets/nav_profile.jpg"

export default function Navbar() {
  return (
    <div className='navbar'>
      <img src={nav_logo} alt="" className="nav-logo"/>
      <img src={navProfile} className='nav-profile' alt="" />
    </div>
  )
}
